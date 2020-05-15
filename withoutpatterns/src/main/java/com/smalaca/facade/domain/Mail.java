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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Mail mail = (Mail) o;

        if (from != null ? !from.equals(mail.from) : mail.from != null) return false;
        if (to != null ? !to.equals(mail.to) : mail.to != null) return false;
        if (title != null ? !title.equals(mail.title) : mail.title != null) return false;
        return content != null ? content.equals(mail.content) : mail.content == null;
    }

    @Override
    public int hashCode() {
        int result = from != null ? from.hashCode() : 0;
        result = 31 * result + (to != null ? to.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        return result;
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
