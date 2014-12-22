/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 hsz Jakub Chrzanowski <jakub@hsz.mobi>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package mobi.hsz.idea.gitignore.file.type.npmignore;

import mobi.hsz.idea.gitignore.file.type.IgnoreFileType;
import mobi.hsz.idea.gitignore.lang.npmignore.NpmignoreLanguage;

/**
 * Describes Npmignore file type.
 *
 * @author Jakub Chrzanowski <jakub@hsz.mobi>
 * @since 0.8
 */
public class NpmignoreFileType extends IgnoreFileType {
    /** Contains {@link NpmignoreFileType} singleton. */
    public static final NpmignoreFileType INSTANCE = new NpmignoreFileType();

    /** Private constructor to prevent direct object creation. */
    private NpmignoreFileType() {
        super(NpmignoreLanguage.INSTANCE);
    }

    /**
     * Returns current instance.
     *
     * @return current instance
     */
    @Override
    public NpmignoreFileType getInstance() {
        return INSTANCE;
    }
}
