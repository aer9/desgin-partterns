package cn.atofinon.cloud.designpattern.responsibility;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author yangjw
 * @Date 1/8/22 4:43 PM
 * @Descrition
 */


public class ProviderCenter {


    private List<AssetProvider> providers = new ArrayList<>();


    public ProviderCenter() {
        RightProvider rightProvider=new RightProvider();
        providers.add(rightProvider);
        VipFreeProvider vipFreeProvider=new VipFreeProvider();
        providers.add(vipFreeProvider);
        ZeroProvider zeroProvider=new ZeroProvider();
        providers.add(zeroProvider);

        providers = providers.stream().sorted(Comparator.comparing(AssetProvider::getPriority)).collect(Collectors.toList());
    }



    private void addProvider(AssetProvider provider) {
        providers.add(provider);
    }

    public boolean doProcess(Integer param) {
        for (AssetProvider provider : providers) {
            boolean process = provider.process(param);
            if (process){
                break;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        ProviderCenter providerCenter=new ProviderCenter();
        providerCenter.doProcess(2);
    }
}
