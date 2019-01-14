package com.smalaca.facade.domain;

import java.util.ArrayList;
import java.util.List;

public class Mail {
    private final MailAddress from;
    private final MailAddress to;
    private final String title;
    private final String content;
    private final List<Attachment> attachments;

    private Mail(Builder builder) {
        this.from = builder.from;
        this.to = builder.to;
        this.title = builder.title;
        this.content = builder.content;
        this.attachments = builder.attachments;
    }

    public static class Builder {
        private final List<Attachment> attachments = new ArrayList<>();
        private final MailAddress from;
        private final MailAddress to;
        private String title;
        private String content;

        private Builder(MailAddress from, MailAddress to) {
            this.from = from;
            this.to = to;
        }

        public static Builder aMail(MailAddress from, MailAddress to) {
            return new Builder(from, to);
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder content(String content) {
            this.content = content;
            return this;
        }

        public Builder addAttachement(Attachment attachment) {
            attachments.add(attachment);
            return this;
        }

        public Mail build() {
            return new Mail(this);
        }
    }
}
