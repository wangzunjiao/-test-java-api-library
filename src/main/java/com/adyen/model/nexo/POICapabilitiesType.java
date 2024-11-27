package com.adyen.model.nexo;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
import java.util.Arrays;


/**
 * <p>Java class for POICapabilitiesType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;simpleType name="POICapabilitiesType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CashierDisplay"/&gt;
 *     &lt;enumeration value="CashierError"/&gt;
 *     &lt;enumeration value="CashierInput"/&gt;
 *     &lt;enumeration value="CustomerDisplay"/&gt;
 *     &lt;enumeration value="CustomerError"/&gt;
 *     &lt;enumeration value="CustomerInput"/&gt;
 *     &lt;enumeration value="PrinterReceipt"/&gt;
 *     &lt;enumeration value="PrinterDocument"/&gt;
 *     &lt;enumeration value="PrinterVoucher"/&gt;
 *     &lt;enumeration value="MagStripe"/&gt;
 *     &lt;enumeration value="ICC"/&gt;
 *     &lt;enumeration value="EMVContactless"/&gt;
 *     &lt;enumeration value="CashHandling"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "POICapabilitiesType")
@XmlEnum
public enum POICapabilitiesType {


    /**
     * Used by the Sale System when the device is managed by the POI Terminal, to ask question or display some information to the Cashier.
     */
    @XmlEnumValue("CashierDisplay")
    @Schema(description = "Used by the Sale System when the device is managed by the POI Terminal, to ask question or display some information to the Cashier.")
    CASHIER_DISPLAY("CashierDisplay"),

    /**
     * To display to the Cashier information is related to an error situation occurring on the Sale Terminal when the device is managed by the POI Terminal.
     */
    @XmlEnumValue("CashierError")
    @Schema(description = "To display to the Cashier information is related to an error situation occurring on the Sale Terminal when the device is managed by the POI Terminal.")
    CASHIER_ERROR("CashierError"),

    /**
     * Any kind of keyboard allowing all or part of the commands of the Input messageType request from the POI System to the Sale System (InputCommand data element). The
     */
    @XmlEnumValue("CashierInput")
    @Schema(description = "Any kind of keyboard allowing all or part of the commands of the Input message request from the POI System to the Sale System (InputCommand data element). The")
    CASHIER_INPUT("CashierInput"),

    /**
     * Standard Customer display interface used by the Sale System to ask question, or to show information to the Customer outside a Service dialogue.
     */
    @XmlEnumValue("CustomerDisplay")
    @Schema(description = "Standard Customer display interface used by the Sale System to ask question, or to show information to the Customer outside a Service dialogue.")
    CUSTOMER_DISPLAY("CustomerDisplay"),

    /**
     * To display to the Customer information is related to an error situation occurring on the Sale Terminal during a Sale transaction.
     */
    @XmlEnumValue("CustomerError")
    @Schema(description = "To display to the Customer information is related to an error situation occurring on the Sale Terminal during a Sale transaction.")
    CUSTOMER_ERROR("CustomerError"),

    /**
     * Any kind of keyboard allowing all or part of the commands of the Input messageType request from the POI System to the Sale System (InputCommand data element). The
     */
    @XmlEnumValue("CustomerInput")
    @Schema(description = "Any kind of keyboard allowing all or part of the commands of the Input message request from the POI System to the Sale System (InputCommand data element). The")
    CUSTOMER_INPUT("CustomerInput"),

    /**
     * Printer for the Sale receipt.
     */
    @XmlEnumValue("PrinterReceipt")
    @Schema(description = "Printer for the Sale receipt.")
    PRINTER_RECEIPT("PrinterReceipt"),

    /**
     * When the Sale System wants to print specific document (check, dynamic currency conversion ...).
     */
    @XmlEnumValue("PrinterDocument")
    @Schema(description = "When the Sale System wants to print specific document (check, dynamic currency conversion ...). ")
    PRINTER_DOCUMENT("PrinterDocument"),

    /**
     * Coupons, voucher or special ticket generated by the Sale System and to be printed.
     */
    @XmlEnumValue("PrinterVoucher")
    @Schema(description = "Coupons, voucher or special ticket generated by the Sale System and to be printed.")
    PRINTER_VOUCHER("PrinterVoucher"),

    /**
     * Magnetic stripe card reader
     */
    @XmlEnumValue("MagStripe")
    @Schema(description = "Magnetic stripe card reader")
    MAG_STRIPE("MagStripe"),

    /**
     * Contact  ICC card reader
     */
    ICC("ICC"),

    /**
     * Contactless card reader with EMV applications
     */
    @XmlEnumValue("EMVContactless")
    @Schema(description = "Contactless card reader with EMV applications")
    EMV_CONTACTLESS("EMVContactless"),

    /**
     * Device which performs cash change, cash dispense or cash acceptance.
     */
    @XmlEnumValue("CashHandling")
    @Schema(description = "Device which performs cash change, cash dispense or cash acceptance.")
    CASH_HANDLING("CashHandling");
    private final String value;

    POICapabilitiesType(String v) {
        value = v;
    }

    /**
     * Value string.
     *
     * @return the string
     */
    public String value() {
        return value;
    }

    /**
     * From value poi capabilities type.
     *
     * @param v the v
     * @return the poi capabilities type
     */
    public static POICapabilitiesType fromValue(String v) {
        return Arrays.stream(values()).
                filter(s -> s.value.equals(v)).
                findFirst().orElseThrow(() -> new IllegalArgumentException(v));
    }

}
