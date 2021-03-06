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
package org.lobobrowser.html.svgimpl;

import org.lobobrowser.w3c.svg.SVGPathSeg;
import org.lobobrowser.w3c.svg.SVGPathSegCurvetoCubicAbs;

public class SVGPathSegCurvetoCubicAbsImpl extends SVGPathSegImpl implements SVGPathSegCurvetoCubicAbs {

	private static final long serialVersionUID = -6722776032077341870L;
	
	private float x1;
	private float x2;
	private float y1;
	private float y2;

	/**
	 * @param x
	 * @param y
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 */
	public SVGPathSegCurvetoCubicAbsImpl(float x1, float y1, float x2, float y2, float x, float y) {
		this.x = x;
		this.y = y;
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	@Override
	public short getPathSegType() {
		return SVGPathSeg.PATHSEG_CURVETO_CUBIC_ABS;
	}

	@Override
	public String getPathSegTypeAsLetter() {

		return "C";
	}

	@Override
	public float getX1() {
		return x1;
	}

	@Override
	public void setX1(float x1) {
		this.x1 = x1;
	}

	@Override
	public float getY1() {
		return y1;
	}

	@Override
	public void setY1(float y1) {
		this.y1 = y1;
	}

	@Override
	public float getX2() {
		return x2;
	}

	@Override
	public void setX2(float x2) {
		this.x2 = x2;
	}

	@Override
	public float getY2() {
		return y2;
	}

	@Override
	public void setY2(float y2) {
		this.y2 = y2;
	}
}
