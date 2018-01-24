

    static String[] checkIP(String[] ip) {
        
        String ip4= "IPv4";
        String ip6= "IPv6";
        String neither= "Neither";
        Matcher match;Pattern pat;
        String str1 = Arrays.toString(ip);
        System.out.println("string "+str1);
        final String ipv4 =
            "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."+
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."+
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."+
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
        final String ipv6 = 
            "^[0-9a-f]{1,4}:" + "[0-9a-f]{1,4}:"+
            "[0-9a-f]{1,4}:" + "[0-9a-f]{1,4}:"+
            "[0-9a-f]{1,4}:" + "[0-9a-f]{1,4}:"+
            "[0-9a-f]{1,4}:" + "[0-9a-f]{1,4}$";
        int length = ip.length;
        ArrayList<String> ans = new ArrayList<String>();
        //System.out.println("length "+length);
        for (int i=0;i<length;i++)
        {
            if (ip[i].indexOf(".")>0)
            {
                pat=Pattern.compile(ipv4);
                match=pat.matcher(ip[i]);
                if(match.matches())
                {
                    ans.add(ip4);    
                }
                else
                {
                    ans.add(neither);
                }
            }
            else if(ip[i].indexOf(":")>0)
            {
                pat=Pattern.compile(ipv6);
                match=pat.matcher(ip[i]);
                if (match.matches())
                {
                    ans.add(ip6);    
                }
                else
                {
                    ans.add(neither);
                }
            }
            else
            {
                ans.add(neither);
            }
        }
        String[] newStr = ans.toArray(new String[ans.size()]);
        return newStr;
        

    }

