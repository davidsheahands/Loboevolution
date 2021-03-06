/*
    GNU GENERAL LICENSE
    Copyright (C) 2006 The Lobo Project. Copyright (C) 2014 - 2017 Lobo Evolution

    This program is free software; you can redistribute it and/or
    modify it under the terms of the GNU General Public
    License as published by the Free Software Foundation; either
    verion 3 of the License, or (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
    General License for more details.

    You should have received a copy of the GNU General Public
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
    

    Contact info: lobochief@users.sourceforge.net; ivan.difrancesco@yahoo.it
 */
package org.lobobrowser.html.domimpl;

import org.lobobrowser.html.HtmlAttributeProperties;
import org.lobobrowser.w3c.html.HTMLBRElement;

/**
 * The Class HTMLBRElementImpl.
 */
public class HTMLBRElementImpl extends HTMLElementImpl implements HTMLBRElement {

    /**
     * Instantiates a new HTMLBR element impl.
     *
     * @param name
     *            the name
     */
    public HTMLBRElementImpl(String name) {
        super(name);
    }

    /*
     * (non-Javadoc)
     * @see org.lobobrowser.w3c.html.HTMLBRElement#getClear()
     */
    @Override
    public String getClear() {
        return this.getAttribute(HtmlAttributeProperties.CLEAR);
    }

    /*
     * (non-Javadoc)
     * @see org.lobobrowser.w3c.html.HTMLBRElement#setClear(java.lang.String)
     */
    @Override
    public void setClear(String clear) {
        this.setAttribute(HtmlAttributeProperties.CLEAR, clear);
    }

    /*
     * (non-Javadoc)
     * @see org.lobobrowser.html.domimpl.DOMNodeImpl#appendInnerTextImpl(java.lang.
     * StringBuffer)
     */
    @Override
    protected void appendInnerTextImpl(StringBuffer buffer) {
        buffer.append("\r\n");
        super.appendInnerTextImpl(buffer);
    }
}
