/* 1108. Defanging an IP Address ( easy)
 * --------------------------------------
Given a valid (IPv4) IP address, return a defanged version of that IP address.
A defanged IP address replaces every period "." with "[.]".

Example 1:
Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"

Example 2:
Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"
 
 */

package c08_strings.leetcode;

public class DefainingIp {
	public static void main(String[] args) {
		String address = "255.100.50.0";
		DefainingIp obj = new DefainingIp();
		String result = obj.defangIPaddr(address);

		System.out.println(result);

	}

	public String defangIPaddr(String address) {
		return address.replace(".", "[.]");

	}

}
