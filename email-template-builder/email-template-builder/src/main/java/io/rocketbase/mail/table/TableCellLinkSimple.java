package io.rocketbase.mail.table;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class TableCellLinkSimple implements TableCellLink {

    final String text;
    final String linkUrl;

}
