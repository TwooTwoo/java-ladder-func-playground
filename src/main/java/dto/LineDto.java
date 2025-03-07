package dto;

import model.Line;
import model.Link;
import model.LinkStatus;

import java.util.List;

public class LineDto {
    private final List<Boolean> linkExistCollection;

    private LineDto(List<Boolean> linkExistCollection) {
        this.linkExistCollection = linkExistCollection;
    }

    public static LineDto from(Line line) {
        List<Boolean> linkExistCollection = line.getLinks().stream()
                .map(Link::getLinkstatus)
                .map(LinkStatus::isPresent)
                .toList();

        return new LineDto(linkExistCollection);
    }

    public List<Boolean> getLinkExistCollection() {
        return List.copyOf(linkExistCollection);
    }

}
