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
package org.lobobrowser.html;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lobobrowser.html.domimpl.HTMLDocumentImpl;
import org.w3c.dom.Element;

public class HtmlUnorderedListTest extends SimpleLoboTest {

    @Test
    public void asText() throws Exception {
        String htmlSource = "<html><head>"
            + "</head><body>"
            + "<ul id='foo'>"
            + "<li>first item</li>"
            + "<li>second item</li>"
            + "something without li node"
            + "<li>third item</li>"
            + "</ul>"
            + "</body></html>";

        HTMLDocumentImpl page = loadPage(htmlSource);
        Element node = page.getElementById("foo");
        final String expectedText = "first item" + SEPARATOR_LINE
            + "second item" + SEPARATOR_LINE
            + "something without li node" + SEPARATOR_LINE
            + "third item";
        
        assertEquals(expectedText, page.getTextContent());
        assertEquals(expectedText, node.getTextContent());   
    }
}
