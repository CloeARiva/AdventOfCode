import java.util.Vector;

public class DayOne_MassToFuel {

     public static Integer calculateTotalFuel() {

         Vector<Integer> input = new Vector<Integer>();
         input.add(120183);
         input.add(105169);
         input.add(58942);
         input.add(105283);
         input.add(100729);
         input.add(57778);
         input.add(59601);
         input.add(86011);
         input.add(148930);
         input.add(76533);
         input.add(132625);
         input.add(79105);
         input.add(66334);
         input.add(87695);
         input.add(148836);
         input.add(129384);
         input.add(71225);
         input.add(96010);
         input.add(67221);
         input.add(139037);
         input.add(90010);
         input.add(72531);
         input.add(145543);
         input.add(137983);
         input.add(63687);
         input.add(131307);
         input.add(62602);
         input.add(129223);
         input.add(76717);
         input.add(98896);
         input.add(58484);
         input.add(127996);
         input.add(128840);
         input.add(60723);
         input.add(149932);
         input.add(141443);
         input.add(96997);
         input.add(96196);
         input.add(104670);
         input.add(104055);
         input.add(129552);
         input.add(54426);
         input.add(104507);
         input.add(80241);
         input.add(91570);
         input.add(140053);
         input.add(106108);
         input.add(119792);
         input.add(133703);
         input.add(66387);
         input.add(129594);
         input.add(144794);
         input.add(91962);
         input.add(134610);
         input.add(97937);
         input.add(111599);
         input.add(77667);
         input.add(133644);
         input.add(89207);
         input.add(121935);
         input.add(80434);
         input.add(147413);
         input.add(94091);
         input.add(110244);
         input.add(59255);
         input.add(53071);
         input.add(133121);
         input.add(55972);
         input.add(122369);
         input.add(95605);
         input.add(142303);
         input.add(120242);
         input.add(113412);
         input.add(107519);
         input.add(88325);
         input.add(85243);
         input.add(104752);
         input.add(85418);
         input.add(101515);
         input.add(145236);
         input.add(107302);
         input.add(142970);
         input.add(87763);
         input.add(112798);
         input.add(105469);
         input.add(88303);
         input.add(91668);
         input.add(129187);
         input.add(115297);
         input.add(56238);
         input.add(69358);
         input.add(109148);
         input.add(99943);
         input.add(96480);
         input.add(98344);
         input.add(77777);
         input.add(98973);
         input.add(138814);
         input.add(106194);
         input.add(128739);

         Integer totalFuel = 0;
         for (int i=0; i<input.size(); i++) {
             Integer mass = input.get(i);
             Integer fuel = calculateFuel(mass);
             totalFuel += fuel;
         }
         return totalFuel;
     }

    private static Integer calculateFuel(Integer mass) {
        //divide by three, round down, and subtract 2.
        return (int)Math.floor(mass/3) - 2;
    }

}
