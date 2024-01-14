package org.oopscraft.arch4j.batch.item.file;

import lombok.Setter;
import org.oopscraft.arch4j.batch.item.file.transform.DelimitedLineAggregator;
import org.oopscraft.arch4j.batch.item.file.transform.FieldConversionService;
import org.oopscraft.arch4j.batch.item.file.transform.ItemTypeDescriptor;
import org.oopscraft.arch4j.batch.sample.dto.SampleFile;
import org.springframework.batch.item.file.transform.BeanWrapperFieldExtractor;
import org.springframework.batch.item.file.transform.LineAggregator;
import org.springframework.format.support.FormattingConversionService;
import org.springframework.util.ReflectionUtils;

import java.util.ArrayList;
import java.util.List;

public class DelimitedFileItemWriter<T> extends GenericFileItemWriter<T> {

    @Setter
    public String delimiter = String.valueOf(',');

    @Override
    protected LineAggregator<T> createLineAggregator(Class<? extends T> itemType) {
        // item type descriptor
        ItemTypeDescriptor itemTypeDescriptor = new ItemTypeDescriptor(itemType);

        // conversion service
        FieldConversionService conversionService = FieldConversionService.builder()
                .dateTimeFormatter(dateTimeFormatter)
                .dateFormatter(dateFormatter)
                .timeFormatter(timeFormatter)
                .build();

        // field extractor
        BeanWrapperFieldExtractor<T> fieldExtractor = new BeanWrapperFieldExtractor<>();
        fieldExtractor.setNames(itemTypeDescriptor.getFieldNames().toArray(new String[0]));

        // line aggregator
        DelimitedLineAggregator<T> lineAggregator = new DelimitedLineAggregator<>(itemTypeDescriptor);
        lineAggregator.setDelimiter(delimiter);
        lineAggregator.setFieldExtractor(fieldExtractor);
        lineAggregator.setConversionService(conversionService);

        // return
        return lineAggregator;
    }

}