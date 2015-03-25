package com.card;

import java.util.List;

/**
 * Created by Robert_Papp1 on 3/23/2015.
 */
public class GoogleNowCard {

    private final int currentActivityPoint;
    private final int lastActivityPoint;
    private final String LOGO_URL;

    private final List<String> urls;
    private final String title;
    private final String text;

    private GoogleNowCard(Builder builder) {
        this.currentActivityPoint = builder.currentActivityPoint;
        this.lastActivityPoint = builder.lastActivityPoint;
        this.LOGO_URL = builder.LOGO_URL;
        this.urls = builder.urls;
        this.title = builder.title;
        this.text = builder.text;

    }

    public int getCurrentActivityPoint() {
        return currentActivityPoint;
    }

    public int getLastActivityPoint() {
        return lastActivityPoint;
    }

    public String getLOGO_URL() {
        return LOGO_URL;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public List<String> getUrls() {
        return urls;
    }

    public static class Builder {

        private final String LOGO_URL;
        private final int currentActivityPoint;
        private final int lastActivityPoint;

        private List<String> urls;
        private String title;
        private String text;

        public Builder(int currentActivityPoint, int lastActivityPoint, String logoUrl) {
            this.currentActivityPoint = currentActivityPoint;
            this.lastActivityPoint = lastActivityPoint;
            this.LOGO_URL = logoUrl;
            setTitleAndText();
        }

        private void setTitleAndText() {
            int compareToActivityPoint = currentActivityPoint - lastActivityPoint;

            if (compareToActivityPoint == 0) {
                title(GoogleNowCardConstants.ACTIVIY_LEVEL_MAINTAINED_TITLE);
                text(GoogleNowCardConstants.ACTIVIY_LEVEL_MAINTAINED_TEXT);
            }
            else if (compareToActivityPoint > 0) {
                title(GoogleNowCardConstants.ACTIVIY_LEVEL_INCREASED_TITLE);
                text(GoogleNowCardConstants.ACTIVIY_LEVEL_INCREASED_TEXT);
            } else{
                title(GoogleNowCardConstants.ACTIVIY_LEVEL_DECRASED_TITLE);
                text(GoogleNowCardConstants.ACTIVIY_LEVEL_DECRASED_TEXT);
            }
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder text(String text) {
            this.text = text;
            return this;
        }

        public Builder url(List<String> urls) {
            this.urls = urls;
            return this;
        }

        public GoogleNowCard build() {
            return new GoogleNowCard(this);
        }
    }
}
