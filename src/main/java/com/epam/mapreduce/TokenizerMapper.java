package com.epam.mapreduce;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;
import java.util.StringTokenizer;

public class TokenizerMapper extends Mapper<LongWritable, Text, Text, LongWritable> {
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        for (StringTokenizer tokenizer = new StringTokenizer(value.toString()); tokenizer.hasMoreTokens(); ) {
            String s = tokenizer.nextToken();
            context.write(new Text(s), new LongWritable(1));
        }
    }
}
