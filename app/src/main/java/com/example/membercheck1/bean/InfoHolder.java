package com.example.membercheck1.bean;

import com.example.membercheck1.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 区枫华 on 2017/5/18.
 */

public class InfoHolder {

    private static List<Info> list = null;

    public static List<Info> getList() {
        if (list == null) {
            list = new ArrayList<>();
            list.add(new Info("Ollie Cole", "United States minor", 1, 19, R.drawable.head1, 1825));
            list.add(new Info("Julian Mendez", "Isle of Man", 2, 7, R.drawable.head2, 904));
            list.add(new Info("Isabella Silva", "NetherLands Antilles", 3, 13, R.drawable.head3, 703));
            list.add(new Info("Albert Floyd", "India", 4, 12, R.drawable.head4, 698));
            list.add(new Info("Sadie Tucker", "Saint Martin", 5, 9, R.drawable.head5, 589));
            list.add(new Info("Leader Concept", "Suleiman Ali Shakir", 6, 11, R.drawable.head1, 466));
            list.add(new Info("Craig Hooper", "Material Design", 7, 22, R.drawable.head2, 230));
        }
        return list;
    }

}
