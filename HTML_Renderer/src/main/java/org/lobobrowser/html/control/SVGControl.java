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

package org.lobobrowser.html.control;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lobobrowser.html.info.SVGInfo;
import org.lobobrowser.html.style.AbstractCSS2Properties;
import org.lobobrowser.html.svgimpl.SVGCircleElementImpl;
import org.lobobrowser.html.svgimpl.SVGEllipseElementImpl;
import org.lobobrowser.html.svgimpl.SVGLineElementImpl;
import org.lobobrowser.html.svgimpl.SVGPathElementImpl;
import org.lobobrowser.html.svgimpl.SVGPolygonElementImpl;
import org.lobobrowser.html.svgimpl.SVGPolylineElementImpl;
import org.lobobrowser.html.svgimpl.SVGRectElementImpl;
import org.lobobrowser.html.svgimpl.SVGSVGElementImpl;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class SVGControl extends SVGBasicControl {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The Constant logger. */
	private static final Logger logger = LogManager.getLogger(SVGControl.class.getName());

	private ArrayList<SVGInfo> svgList = new ArrayList<SVGInfo>();
	
	/** The circle. */
	private final int CIRCLE = 1;

	/** The rect. */
	private final int RECT = 2;

	/** The ellipse. */
	private final int ELLIPSE = 3;
	
	/** The line. */
	private final int LINE = 4;
	
	/** The line. */
	private final int POLYGON = 5;
	
	/** The line. */
	private final int POLYLINE = 6;
	
	/** The path. */
	private final int PATH = 7;

	public SVGControl(SVGSVGElementImpl modelNode) {
		super(modelNode);
		NodeList childNodes = modelNode.getChildNodes();
		for (int i = 0; i < childNodes.getLength(); i++) {
			Node n = (Node) childNodes.item(i);

			if (n instanceof SVGCircleElementImpl) {
				SVGCircleElementImpl svgcircle = (SVGCircleElementImpl) n;
				AbstractCSS2Properties style = svgcircle.getStyle();
				
				SVGInfo svgi = new SVGInfo();
				svgi.setMethod(CIRCLE);
				svgi.setX(svgcircle.getCx().getBaseVal().getValue());
				svgi.setY(svgcircle.getCy().getBaseVal().getValue());
				svgi.setR(svgcircle.getR().getBaseVal().getValue());

				if (svgcircle.getFill() != null) {
					style.setFill(svgcircle.getFill());
				}
				
				if (svgcircle.getStroke() != null) {
					style.setStroke(svgcircle.getStroke());
				}
				
				if (svgcircle.getStrokeDashArray() != null) {
					style.setStrokeDashArray(svgcircle.getStrokeDashArray());
				}
				
				if (svgcircle.getStrokeLineCap() != null) {
					style.setStrokeLineCap(svgcircle.getStrokeLineCap());
				}
				
				if (svgcircle.getStrokeMiterLimit() != null) {
					style.setStrokeMiterLimit(svgcircle.getStrokeMiterLimit());
				}
				
				if (svgcircle.getStrokeOpacity() != null) {
					style.setStrokeOpacity(svgcircle.getStrokeOpacity());
				}
				
				if (svgcircle.getStrokeWidth() != null) {
					style.setStrokeWidth(svgcircle.getStrokeWidth());
				}
				
				svgi.setTransformList(svgcircle.getTransform().getBaseVal());
				svgi.setStyle(style);
				svgList.add(svgi);
			}

			if (n instanceof SVGRectElementImpl) {
				SVGRectElementImpl svgrect = (SVGRectElementImpl) n;
				AbstractCSS2Properties style = svgrect.getStyle();
				
				SVGInfo svgi = new SVGInfo();
				svgi.setMethod(RECT);
				svgi.setX(svgrect.getX().getBaseVal().getValue());
				svgi.setY(svgrect.getY().getBaseVal().getValue());
				svgi.setWidth(svgrect.getWidth().getBaseVal().getValue());
				svgi.setHeight(svgrect.getHeight().getBaseVal().getValue());
				svgi.setRx(svgrect.getRx().getBaseVal().getValue());
				svgi.setRy(svgrect.getRy().getBaseVal().getValue());

				if (svgrect.getFill() != null) {
					style.setFill(svgrect.getFill());
				}
				
				if (svgrect.getStroke() != null) {
					style.setStroke(svgrect.getStroke());
				}
				
				if (svgrect.getStrokeDashArray() != null) {
					style.setStrokeDashArray(svgrect.getStrokeDashArray());
				}
				
				if (svgrect.getStrokeLineCap() != null) {
					style.setStrokeLineCap(svgrect.getStrokeLineCap());
				}
				
				if (svgrect.getStrokeMiterLimit() != null) {
					style.setStrokeMiterLimit(svgrect.getStrokeMiterLimit());
				}
				
				if (svgrect.getStrokeOpacity() != null) {
					style.setStrokeOpacity(svgrect.getStrokeOpacity());
				}
				
				if (svgrect.getStrokeWidth() != null) {
					style.setStrokeWidth(svgrect.getStrokeWidth());
				}
				
				svgi.setTransformList(svgrect.getTransform().getBaseVal());
				svgi.setStyle(style);
				svgList.add(svgi);
			}

			if (n instanceof SVGEllipseElementImpl) {
				SVGEllipseElementImpl svgellipse = (SVGEllipseElementImpl) n;
				AbstractCSS2Properties style = svgellipse.getStyle();
				
				SVGInfo svgi = new SVGInfo();
				svgi.setMethod(ELLIPSE);
				svgi.setX(svgellipse.getCx().getBaseVal().getValue());
				svgi.setY(svgellipse.getCy().getBaseVal().getValue());
				svgi.setRx(svgellipse.getRx().getBaseVal().getValue());
				svgi.setRy(svgellipse.getRy().getBaseVal().getValue());
				
				if (svgellipse.getFill() != null) {
					style.setFill(svgellipse.getFill());
				}
				
				if (svgellipse.getStroke() != null) {
					style.setStroke(svgellipse.getStroke());
				}
				
				if (svgellipse.getStrokeDashArray() != null) {
					style.setStrokeDashArray(svgellipse.getStrokeDashArray());
				}
				
				if (svgellipse.getStrokeLineCap() != null) {
					style.setStrokeLineCap(svgellipse.getStrokeLineCap());
				}
				
				if (svgellipse.getStrokeMiterLimit() != null) {
					style.setStrokeMiterLimit(svgellipse.getStrokeMiterLimit());
				}
				
				if (svgellipse.getStrokeOpacity() != null) {
					style.setStrokeOpacity(svgellipse.getStrokeOpacity());
				}
				
				if (svgellipse.getStrokeWidth() != null) {
					style.setStrokeWidth(svgellipse.getStrokeWidth());
				}
				
				svgi.setTransformList(svgellipse.getTransform().getBaseVal());
				svgi.setStyle(svgellipse.getStyle());
				svgList.add(svgi);
			}
			
			if (n instanceof SVGLineElementImpl) {
				SVGLineElementImpl svgline = (SVGLineElementImpl) n;
				AbstractCSS2Properties style = svgline.getStyle();
				
				SVGInfo svgi = new SVGInfo();
				svgi.setMethod(LINE);
				svgi.setX1(svgline.getX1().getBaseVal().getValue());
				svgi.setY1(svgline.getY1().getBaseVal().getValue());
				svgi.setX2(svgline.getX2().getBaseVal().getValue());
				svgi.setY2(svgline.getY2().getBaseVal().getValue());
				
				if (svgline.getFill() != null) {
					style.setFill(svgline.getFill());
				}
				
				if (svgline.getStroke() != null) {
					style.setStroke(svgline.getStroke());
				}
				
				if (svgline.getStrokeDashArray() != null) {
					style.setStrokeDashArray(svgline.getStrokeDashArray());
				}
				
				if (svgline.getStrokeLineCap() != null) {
					style.setStrokeLineCap(svgline.getStrokeLineCap());
				}
				
				if (svgline.getStrokeMiterLimit() != null) {
					style.setStrokeMiterLimit(svgline.getStrokeMiterLimit());
				}
				
				if (svgline.getStrokeOpacity() != null) {
					style.setStrokeOpacity(svgline.getStrokeOpacity());
				}
				
				if (svgline.getStrokeWidth() != null) {
					style.setStrokeWidth(svgline.getStrokeWidth());
				}
				
				svgi.setTransformList(svgline.getTransform().getBaseVal());
				svgi.setStyle(svgline.getStyle());
				svgList.add(svgi);
			}
			
			if (n instanceof SVGPolylineElementImpl) {
				SVGPolylineElementImpl svgline = (SVGPolylineElementImpl) n;
				AbstractCSS2Properties style = svgline.getStyle();
				
				SVGInfo svgi = new SVGInfo();
				svgi.setMethod(POLYLINE);
				svgi.setPoilist(svgline.getPoints());
				
				if (svgline.getFill() != null) {
					style.setFill(svgline.getFill());
				}
				
				if (svgline.getStroke() != null) {
					style.setStroke(svgline.getStroke());
				}
				
				if (svgline.getStrokeDashArray() != null) {
					style.setStrokeDashArray(svgline.getStrokeDashArray());
				}
				
				if (svgline.getStrokeLineCap() != null) {
					style.setStrokeLineCap(svgline.getStrokeLineCap());
				}
				
				if (svgline.getStrokeMiterLimit() != null) {
					style.setStrokeMiterLimit(svgline.getStrokeMiterLimit());
				}
				
				if (svgline.getStrokeOpacity() != null) {
					style.setStrokeOpacity(svgline.getStrokeOpacity());
				}
				
				if (svgline.getStrokeWidth() != null) {
					style.setStrokeWidth(svgline.getStrokeWidth());
				}
				
				svgi.setTransformList(svgline.getTransform().getBaseVal());
				svgi.setStyle(svgline.getStyle());
				svgList.add(svgi);
			}
			
			if (n instanceof SVGPolygonElementImpl) {
				SVGPolygonElementImpl svgline = (SVGPolygonElementImpl) n;
				AbstractCSS2Properties style = svgline.getStyle();
				
				SVGInfo svgi = new SVGInfo();
				svgi.setMethod(POLYGON);
				svgi.setPoilist(svgline.getPoints());
				
				if (svgline.getFill() != null) {
					style.setFill(svgline.getFill());
				}
				
				if (svgline.getStroke() != null) {
					style.setStroke(svgline.getStroke());
				}
				
				if (svgline.getStrokeDashArray() != null) {
					style.setStrokeDashArray(svgline.getStrokeDashArray());
				}
				
				if (svgline.getStrokeLineCap() != null) {
					style.setStrokeLineCap(svgline.getStrokeLineCap());
				}
				
				if (svgline.getStrokeMiterLimit() != null) {
					style.setStrokeMiterLimit(svgline.getStrokeMiterLimit());
				}
				
				if (svgline.getStrokeOpacity() != null) {
					style.setStrokeOpacity(svgline.getStrokeOpacity());
				}
				
				if (svgline.getStrokeWidth() != null) {
					style.setStrokeWidth(svgline.getStrokeWidth());
				}
				
				svgi.setTransformList(svgline.getTransform().getBaseVal());
				svgi.setStyle(svgline.getStyle());
				svgList.add(svgi);
			}
			
			if (n instanceof SVGPathElementImpl) {
				SVGPathElementImpl svgpath = (SVGPathElementImpl)n;
				AbstractCSS2Properties style = svgpath.getStyle();
				SVGInfo svgi = new SVGInfo();
				svgi.setMethod(PATH);
				
				if (svgpath.getFill() != null) {
					style.setFill(svgpath.getFill());
				}
				
				if (svgpath.getStroke() != null) {
					style.setStroke(svgpath.getStroke());
				}
				
				if (svgpath.getStrokeDashArray() != null) {
					style.setStrokeDashArray(svgpath.getStrokeDashArray());
				}
				
				if (svgpath.getStrokeLineCap() != null) {
					style.setStrokeLineCap(svgpath.getStrokeLineCap());
				}
				
				if (svgpath.getStrokeMiterLimit() != null) {
					style.setStrokeMiterLimit(svgpath.getStrokeMiterLimit());
				}
				
				if (svgpath.getStrokeOpacity() != null) {
					style.setStrokeOpacity(svgpath.getStrokeOpacity());
				}
				
				if (svgpath.getStrokeWidth() != null) {
					style.setStrokeWidth(svgpath.getStrokeWidth());
				}
				
				svgi.setPathSegList(svgpath.getPathSegList());
				svgi.setStyle(svgpath.getStyle());
				svgList.add(svgi);
				
			}
		}
	}

	@Override
	public void paint(Graphics g) {
		try {
			Graphics2D g2d = (Graphics2D) g;
			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			for (int i = 0; i < svgList.size(); i++) {
				SVGInfo svgi = svgList.get(i);
				switch (svgi.getMethod()) {
				case CIRCLE:
					circle(g2d, svgi);
					break;
				case RECT:
					rectangle(g2d, svgi);
					break;
				case ELLIPSE:
					ellipse(g2d, svgi);
					break;
				case LINE:
					line(g2d, svgi);
					break;
				case POLYGON:
					polygon(g2d, svgi);
					break;
				case POLYLINE:
					polyline(g2d, svgi);
					break;
				case PATH:
					path(g2d, svgi);
					break;
				default:
					break;
				}
			}
		} catch (Exception ex) {
			logger.error("Error", ex);
		}
	}
}
