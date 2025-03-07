package model;

public class Link {
    private LinkStatus linkstatus;

    private Link(LinkStatus linkstatus) {
        this.linkstatus = linkstatus;
    }

    public static Link getUndefinedLink() {
        return new Link(LinkStatus.UNDEFINED);
    }

    public void setLinkStatus(boolean connectDecider, boolean connectable) {
        validateUpdateStatus();

        if (connectDecider && connectable) {
            this.linkstatus = LinkStatus.PRESENT;
            return;
        }

        this.linkstatus = LinkStatus.ABSENT;
    }

    public LinkStatus getLinkstatus() {
        return linkstatus;
    }

    private void validateUpdateStatus() {
        if (isAlreadyFixed()) {
            throw new UnsupportedOperationException("이미 값이 결정된 링크입니다");
        }
    }

    private boolean isAlreadyFixed() {
        return this.linkstatus != LinkStatus.UNDEFINED;
    }

}
