/**
 *
 * APDPlat - Application Product Development Platform
 * Copyright (c) 2013, 杨尚川, yang-shangchuan@qq.com
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.apdplat.word.analysis;

import org.apdplat.word.segmentation.Word;

import java.util.List;

/**
 * 相似度
 * @author 杨尚川
 */
public interface Similarity {
    /**
     * 对象1和对象2是否相似
     * @param object1 对象1
     * @param object2 对象2
     * @return 是否相似
     */
    boolean isSimilar(String object1, String object2);

    /**
     * 对象1和对象2的相似度分值
     * @param object1 对象1
     * @param object2 对象2
     * @return 相似度分值
     */
    double similarScore(String object1, String object2);

    /**
     * 词列表1和词列表2是否相似
     * @param words1 词列表1
     * @param words2 词列表2
     * @return 是否相似
     */
    boolean isSimilar(List<Word> words1, List<Word> words2);

    /**
     * 词列表1和词列表2的相似度分值
     * @param words1 词列表1
     * @param words2 词列表2
     * @return 相似度分值
     */
    double similarScore(List<Word> words1, List<Word> words2);
}