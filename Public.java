package IIMScollege;
import java.util.ArrayList;
import java.util.Scanner;
class Public {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Welcome User");
            System.out.println("What would you like to view?");
            System.out.println("Enter 1 For Policy");
            System.out.println("Enter 2 For Strategies");
            System.out.println("Enter 3 For Planning");
            int a = scan.nextInt();
            if (a == 1) {
                System.out.println("The SDG 13 Policies to combat Climate Change are: ");
                System.out.println("1. Food security, nutrition and livelihoods will be improved by adopting climate-friendly agriculture system.");
                System.out.println("2. Sustainable environmental services will be ensured by developing climate resilient ecosystem. ");
                System.out.println("3. Energy security will be ensured by promoting multiple use of water resources and production of low carbon energy.");
                System.out.println("4. Climate-friendly villages and cities will be built by developing safe, sustainable and resilient habitats and infrastructures");
                System.out.println("5. The concept of climate resilient economic development will be adopted by developing reliable, sustainable and low carbon technology industry, transport and physical infrastructure. ");
                System.out.println("6. Important natural, cultural and social heritages will be conserved and developed by making tourism sector climate-friendly.");

            } else if (a == 2) {
                System.out.println("Please chronologically enter one numeric value of the listed Topics for Clarification of Strategies: ");
                ArrayList topic = new ArrayList();
                topic.add("Agriculture and Food Security (1) \n" );
                topic.add("Forest, Biodiversity and Watershed Conservation (2) \n");
                topic.add("Water Resources and Energy (3) \n");
                topic.add("Rural and Urban Habitats (4) \n ");
                topic.add("Industry, Transport and Physical Infrastructure (5) \n");
                topic.add("Tourism, Natural and Cultural Heritage (6)");
                System.out.println(topic);

                Scanner elaborate = new Scanner(System.in);
                int f = elaborate.nextInt();

                switch(f) {
                    case 1:
                        System.out.println("(a) Agriculture based adaptation programs will be conducted by targeting poor, marginalized, landless, indigenous people and vulnerable households, women and persons with disability.");
                        System.out.println("(b) Agricultural crops suitable for dry and waterlogged areas will be identified and Promoted.");
                        System.out.println("(c) Technologies that protect crops from climate-induced disasters like drought and cold wave will be developed and expanded.");
                        System.out.println("(d) Crop diversification, protection of agricultural biodiversity and organic farming system will be promoted.");
                        break;
                    case 2:
                        System.out.println("(a) Forest carbon sequestration will be increased by adopting sustainable forest management.");
                        System.out.println("(b) Agro-forestry will be developed in sloppy and low-grade forest areas and riverbeds affected by climate-induced risk. ");
                        System.out.println("(c) Action plan will be formulated and implemented for management of wetlands that are at risk of climate change. ");
                        System.out.println("(d) Action plan will be formulated and implemented to conserve rare and endangered wildlife and plants as well as sensitive ecosystems that are at risk of climate change.");
                        break;
                    case 3:
                        System.out.println("(a) Technologies for storage, multiple use and efficient use of water will be developed and promoted in risk-prone areas and settlements considering the effects of climate change on availability of, and access to, water. ");
                        System.out.println("(b) Rainwater harvesting ponds will be constructed for groundwater recharge and their multiple use.");
                        System.out.println("(c) Standards will be developed and implemented for sustainable use of groundwater resources in urban areas.");
                        System.out.println("(d) Production and use of renewable energy and use of energy efficient technologies will be encouraged.");
                        break;
                    case 4:
                        System.out.println("(a) Forest, agricultural, residential and industrial areas will be determined on the basis of risk of climate change impacts while formulating land use plan at local level. ");
                        System.out.println("(b) Adaptation programs will be conducted to mitigate adverse effects of climate change on households and communities residing in unplanned urban and rural settlements and areas prone to climate-induced risks.");
                        System.out.println("(c) Low emission technologies and adaptation programs will be incorporated in settlement development plans. ");
                        System.out.println("(d) Standards will be developed and implemented to make rural and urban settlement infrastructures and buildings systematic.");
                        break;
                    case 5:
                        System.out.println("(a) Mitigation standards will be developed and implemented by identifying key points and causes of emission in industry and transport sector.");
                        System.out.println("(b) Energy efficient technologies and the use of electrical energy will be promoted in industry, transport and physical infrastructure sectors.");
                        System.out.println("(c) Environment-friendly sites will be selected and climate-friendly technologies be used while developing industry, transport and physical infrastructure.");
                        System.out.println("(d) Measures to mitigate climate-induced risk will be followed while designing and constructing physical infrastructures.");
                        break;
                    case 6:
                        System.out.println("(a) Concepts of climate-friendly tourism like eco-tourism, green trekking route and diversification of tourist destinations will be mainstreamed into development of tourism sector.");
                        System.out.println("(b) Concept of zero emission will be implemented by promoting the use of renewable energy and energy efficient technologies in tourist spots.");
                        System.out.println("(c) Transmission of weather forecast information will be systematized by targeting mountaineering and trekking to make the tourism business reliable and safe.");
                        System.out.println("(d) Natural and cultural heritages that are at risk of adverse impacts of climate change will be identified and such areas will be conserved and managed.");
                        break;
                    default:
                        System.out.println("Invalid Input.");
                        break;
                }

            } else if (a == 3) {
                System.out.println("For ensuring proper implementation of SDG 13 Policies and Strategies, Federal, Province and Local Level Government play various important roles: ");
                System.out.println("(1) At the federal level, responsibilities include formulating laws, standards, and a National Adaptation Plan, developing and implementing climate change programs, internationally updating national data, and participating in global climate forums and processes.");
                System.out.println("(2) At the Provincial level, aligning policies, monitoring initiatives, and coordinating programs with federal and local levels takes place");
                System.out.println("(3) Local authorities implement policies, conduct climate programs, monitor initiatives, raise awareness, and establish youth committees all in the local level for disaster management.");
        }
    }
}
