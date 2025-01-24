package io.rocketbase.mail;

import io.rocketbase.mail.EmailTemplateBuilder.EmailTemplateConfigBuilder;
import io.rocketbase.mail.line.AbstractImageLine;
import io.rocketbase.mail.model.HtmlTextEmail;
import io.rocketbase.mail.styling.Alignment;
import lombok.AccessLevel;
import lombok.Getter;

@Getter
public class ImageLine extends AbstractImageLine<ImageLine> implements TemplateLine {


    @Getter(AccessLevel.PRIVATE)
    EmailTemplateConfigBuilder builder;

    protected Alignment alignment;

    ImageLine(EmailTemplateConfigBuilder builder, String src) {
        super(src);
        this.builder = builder;
    }

    public ImageLine alignment(Alignment alignment) {
        this.alignment = alignment;
        return this;
    }

    public ImageLine left() {
        this.alignment = Alignment.LEFT;
        return this;
    }

    public ImageLine center() {
        this.alignment = Alignment.CENTER;
        return this;
    }

    public ImageLine right() {
        this.alignment = Alignment.RIGHT;
        return this;
    }

    @Override
    public TemplateLineType getType() {
        return TemplateLineType.IMAGE;
    }

    @Override
    public EmailTemplateConfigBuilder and() {
        return builder;
    }

    @Override
    public HtmlTextEmail build() {
        return builder.build();
    }
}
