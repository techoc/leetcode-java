package cn.techoc.leetcode.hard;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 测试类：T68.fullJustify
 */
class T68Test {

    private final T68 t68 = new T68();

    /**
     * TC01: 正常多行，包含空格均匀分配
     */
    @Test
    void testFullJustify_NormalCase() {
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;
        List<String> expected = Arrays.asList(
                "This    is    an",
                "example  of text",
                "justification.  "
        );
        List<String> result = t68.fullJustify(words, maxWidth);
        assertEquals(expected, result);
    }

    /**
     * TC02: 包含一行只有一个单词
     */
    @Test
    void testFullJustify_SingleWordLine() {
        String[] words = {"What", "must", "be", "acknowledgment", "shall", "be"};
        int maxWidth = 16;
        List<String> expected = Arrays.asList(
                "What   must   be",
                "acknowledgment  ",
                "shall be        "
        );
        List<String> result = t68.fullJustify(words, maxWidth);
        assertEquals(expected, result);
    }

    /**
     * TC03: 最后一行左对齐
     */
    @Test
    void testFullJustify_LastLineLeftAligned() {
        String[] words = {"Science", "is", "what", "we", "understand", "well", "enough", "to", "explain", "to", "a", "computer.", "Art", "is", "everything", "else", "we", "do"};
        int maxWidth = 20;
        List<String> expected = Arrays.asList(
                "Science  is  what we",
                "understand      well",
                "enough to explain to",
                "a  computer.  Art is",
                "everything  else  we",
                "do                  "
        );
        List<String> result = t68.fullJustify(words, maxWidth);
        assertEquals(expected, result);
    }

    /**
     * TC04: 每行一个单词
     */
    @Test
    void testFullJustify_OneWordPerLine() {
        String[] words = {"Listen", "to", "many,", "speak", "to", "a", "few."};
        int maxWidth = 6;
        List<String> expected = Arrays.asList(
                "Listen",
                "to    ",
                "many, ",
                "speak ",
                "to   a",
                "few.  "
        );
        List<String> result = t68.fullJustify(words, maxWidth);
        assertEquals(expected, result);
    }

    /**
     * TC05: 单个单词
     */
    @Test
    void testFullJustify_SingleWord() {
        String[] words = {"a"};
        int maxWidth = 1;
        List<String> expected = List.of("a");
        List<String> result = t68.fullJustify(words, maxWidth);
        assertEquals(expected, result);
    }

    /**
     * TC06: 多个单词，每行一个
     */
    @Test
    void testFullJustify_MultipleWordsOnePerLine() {
        String[] words = {"a", "b", "c", "d", "e"};
        int maxWidth = 1;
        List<String> expected = Arrays.asList("a", "b", "c", "d", "e");
        List<String> result = t68.fullJustify(words, maxWidth);
        assertEquals(expected, result);
    }
}
