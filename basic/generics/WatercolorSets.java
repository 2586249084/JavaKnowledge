package generics;
//: generics/WatercolorSets.java

import java.util.*;
import generics.watercolors.*;
import static util.Print.*;
import static util.Sets.*;
import static generics.watercolors.Watercolors.*;

public class WatercolorSets {

	public static void main(String[] args) {
		Set<Watercolors> set1 = EnumSet.range(BRILLIANT_RED, VIRIDIAN_HUE);
		Set<Watercolors> set2 = EnumSet.range(CERULEAN_BLUE_HUE, BURNT_UMBER);
		println("set1 : " + set1);
		println("set2 : " + set2);
		println("union(set1, set2) : " + union(set1, set2));
		Set<Watercolors> subset = intersection(set1, set2);
		println("intersection(set1, set2) : " + subset);
		println("difference(set1, subset) : " + difference(set1, subset));
		println("complement(set1, subset) : " + complement(set1, subset));
	}

}/* Output:
set1 : [BRILLIANT_RED, CRIMSON, MAGENTA, ROSE_MADDER, VIOLET, CERULEAN_BLUE_HUE, 
PHTHALO_BLUE, ULTRAMARINE, COBALT_BLUE_HUE, PERMANENT_GREEN, VIRIDIAN_HUE]

set2 : [CERULEAN_BLUE_HUE, PHTHALO_BLUE, ULTRAMARINE, COBALT_BLUE_HUE, 
PERMANENT_GREEN, VIRIDIAN_HUE, SAP_GREEN, YELLOW_OCHER, BURNT_SIENNA, RAW_UMBER, BURNT_UMBER]

union(set1, set2) : [VIOLET, CERULEAN_BLUE_HUE, ROSE_MADDER, SAP_GREEN, BURNT_SIENNA, 
ULTRAMARINE, RAW_UMBER, MAGENTA, PERMANENT_GREEN, BURNT_UMBER, CRIMSON, VIRIDIAN_HUE, 
YELLOW_OCHER, COBALT_BLUE_HUE, BRILLIANT_RED, PHTHALO_BLUE]

intersection(set1, set2) : [CERULEAN_BLUE_HUE, VIRIDIAN_HUE, COBALT_BLUE_HUE, ULTRAMARINE, 
PERMANENT_GREEN, PHTHALO_BLUE]

difference(set1, subset) : [CRIMSON, VIOLET, ROSE_MADDER, BRILLIANT_RED, MAGENTA]

complement(set1, subset) : [CRIMSON, VIOLET, ROSE_MADDER, BRILLIANT_RED, MAGENTA]
*///:~
