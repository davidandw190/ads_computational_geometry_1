package org.cg;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<LineSegment> lineSegments = new ArrayList<>();

        lineSegments.add(new LineSegment(new Point(1, 1), new Point(4, 4)));
        lineSegments.add(new LineSegment(new Point(1, 4), new Point(4, 1)));
        lineSegments.add(new LineSegment(new Point(2, 2), new Point(6, 6)));
        lineSegments.add(new LineSegment(new Point(3, 3), new Point(5, 5)));

        for (int i = 0; i < lineSegments.size(); i++) {
            for (int j = i + 1; j < lineSegments.size(); j++) {
                displayIntersectionResult(lineSegments.get(i), lineSegments.get(j));
            }
        }
    }

    private static void displayIntersectionResult(LineSegment segment1, LineSegment segment2) {
        System.out.println("Line Segment " + segment1.getStart() + " to " + segment1.getEnd() +
                " and Line Segment " + segment2.getStart() + " to " + segment2.getEnd());

        Point intersectionPoint = Point.intersect(segment1.getStart(), segment1.getEnd(),
                segment2.getStart(), segment2.getEnd());

        if (intersectionPoint != null) {
            System.out.println("Line segments intersect at: " + intersectionPoint);
        } else {
            System.out.println("Line segments do not intersect.");
        }

        System.out.println();
    }
}