/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 71
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

//model

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.checkout.ApplePayDonations;
import com.adyen.model.checkout.CardDonations;
import com.adyen.model.checkout.GooglePayDonations;
import com.adyen.model.checkout.IdealDonations;
import com.adyen.model.checkout.PayWithGoogleDonations;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;

import com.fasterxml.jackson.core.type.TypeReference;

import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.Response;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;


@JsonDeserialize(using = DonationPaymentMethod.DonationPaymentMethodDeserializer.class)
@JsonSerialize(using = DonationPaymentMethod.DonationPaymentMethodSerializer.class)
public class DonationPaymentMethod extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(DonationPaymentMethod.class.getName());

    public static class DonationPaymentMethodSerializer extends StdSerializer<DonationPaymentMethod> {
        public DonationPaymentMethodSerializer(Class<DonationPaymentMethod> t) {
            super(t);
        }

        public DonationPaymentMethodSerializer() {
            this(null);
        }

        @Override
        public void serialize(DonationPaymentMethod value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class DonationPaymentMethodDeserializer extends StdDeserializer<DonationPaymentMethod> {
        public DonationPaymentMethodDeserializer() {
            this(DonationPaymentMethod.class);
        }

        public DonationPaymentMethodDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public DonationPaymentMethod deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();

            // deserialize ApplePayDonations
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ApplePayDonations.class.equals(Integer.class) || ApplePayDonations.class.equals(Long.class) || ApplePayDonations.class.equals(Float.class) || ApplePayDonations.class.equals(Double.class) || ApplePayDonations.class.equals(Boolean.class) || ApplePayDonations.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ApplePayDonations.class.equals(Integer.class) || ApplePayDonations.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ApplePayDonations.class.equals(Float.class) || ApplePayDonations.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (ApplePayDonations.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ApplePayDonations.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                // Checks if the unique type of the oneOf json matches any of the object TypeEnum values
                boolean typeMatch = Arrays.stream(ApplePayDonations.TypeEnum.values()).anyMatch((t) -> t.getValue().contains(tree.findValue("type").asText()));
                if (attemptParsing || typeMatch) {
                    // Strict deserialization for oneOf models
                    deserialized = JSON.getMapper().readValue(tree.toString(), ApplePayDonations.class);
                    // typeMatch should enforce proper deserialization
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'ApplePayDonations'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ApplePayDonations'", e);
            }


            // deserialize CardDonations
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CardDonations.class.equals(Integer.class) || CardDonations.class.equals(Long.class) || CardDonations.class.equals(Float.class) || CardDonations.class.equals(Double.class) || CardDonations.class.equals(Boolean.class) || CardDonations.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CardDonations.class.equals(Integer.class) || CardDonations.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CardDonations.class.equals(Float.class) || CardDonations.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (CardDonations.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CardDonations.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                // Checks if the unique type of the oneOf json matches any of the object TypeEnum values
                boolean typeMatch = Arrays.stream(CardDonations.TypeEnum.values()).anyMatch((t) -> t.getValue().contains(tree.findValue("type").asText()));
                if (attemptParsing || typeMatch) {
                    // Strict deserialization for oneOf models
                    deserialized = JSON.getMapper().readValue(tree.toString(), CardDonations.class);
                    // typeMatch should enforce proper deserialization
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'CardDonations'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CardDonations'", e);
            }


            // deserialize GooglePayDonations
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (GooglePayDonations.class.equals(Integer.class) || GooglePayDonations.class.equals(Long.class) || GooglePayDonations.class.equals(Float.class) || GooglePayDonations.class.equals(Double.class) || GooglePayDonations.class.equals(Boolean.class) || GooglePayDonations.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((GooglePayDonations.class.equals(Integer.class) || GooglePayDonations.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((GooglePayDonations.class.equals(Float.class) || GooglePayDonations.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (GooglePayDonations.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (GooglePayDonations.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                // Checks if the unique type of the oneOf json matches any of the object TypeEnum values
                boolean typeMatch = Arrays.stream(GooglePayDonations.TypeEnum.values()).anyMatch((t) -> t.getValue().contains(tree.findValue("type").asText()));
                if (attemptParsing || typeMatch) {
                    // Strict deserialization for oneOf models
                    deserialized = JSON.getMapper().readValue(tree.toString(), GooglePayDonations.class);
                    // typeMatch should enforce proper deserialization
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'GooglePayDonations'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'GooglePayDonations'", e);
            }


            // deserialize IdealDonations
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (IdealDonations.class.equals(Integer.class) || IdealDonations.class.equals(Long.class) || IdealDonations.class.equals(Float.class) || IdealDonations.class.equals(Double.class) || IdealDonations.class.equals(Boolean.class) || IdealDonations.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((IdealDonations.class.equals(Integer.class) || IdealDonations.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((IdealDonations.class.equals(Float.class) || IdealDonations.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (IdealDonations.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (IdealDonations.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                // Checks if the unique type of the oneOf json matches any of the object TypeEnum values
                boolean typeMatch = Arrays.stream(IdealDonations.TypeEnum.values()).anyMatch((t) -> t.getValue().contains(tree.findValue("type").asText()));
                if (attemptParsing || typeMatch) {
                    // Strict deserialization for oneOf models
                    deserialized = JSON.getMapper().readValue(tree.toString(), IdealDonations.class);
                    // typeMatch should enforce proper deserialization
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'IdealDonations'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'IdealDonations'", e);
            }


            // deserialize PayWithGoogleDonations
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (PayWithGoogleDonations.class.equals(Integer.class) || PayWithGoogleDonations.class.equals(Long.class) || PayWithGoogleDonations.class.equals(Float.class) || PayWithGoogleDonations.class.equals(Double.class) || PayWithGoogleDonations.class.equals(Boolean.class) || PayWithGoogleDonations.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((PayWithGoogleDonations.class.equals(Integer.class) || PayWithGoogleDonations.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((PayWithGoogleDonations.class.equals(Float.class) || PayWithGoogleDonations.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (PayWithGoogleDonations.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (PayWithGoogleDonations.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                // Checks if the unique type of the oneOf json matches any of the object TypeEnum values
                boolean typeMatch = Arrays.stream(PayWithGoogleDonations.TypeEnum.values()).anyMatch((t) -> t.getValue().contains(tree.findValue("type").asText()));
                if (attemptParsing || typeMatch) {
                    // Strict deserialization for oneOf models
                    deserialized = JSON.getMapper().readValue(tree.toString(), PayWithGoogleDonations.class);
                    // typeMatch should enforce proper deserialization
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'PayWithGoogleDonations'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'PayWithGoogleDonations'", e);
            }

            // Throw error if there is no match
            if (match == 0) {
                throw new IOException(String.format("Failed deserialization for DonationPaymentMethod: %d classes match result, expected 1", match));
            }
            // Log warning if there is more than one match
            if (match > 1) {
                log.log(Level.WARNING, String.format("Warning, indecisive deserialization for DonationPaymentMethod: %d classes match result, expected 1", match));
            }

            DonationPaymentMethod ret = new DonationPaymentMethod();
            ret.setActualInstance(deserialized);
            return ret;
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public DonationPaymentMethod getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "DonationPaymentMethod cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public DonationPaymentMethod() {
        super("oneOf", Boolean.FALSE);
    }

    public DonationPaymentMethod(ApplePayDonations o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public DonationPaymentMethod(CardDonations o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public DonationPaymentMethod(GooglePayDonations o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public DonationPaymentMethod(IdealDonations o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public DonationPaymentMethod(PayWithGoogleDonations o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ApplePayDonations", new GenericType<ApplePayDonations>() {
        });
        schemas.put("CardDonations", new GenericType<CardDonations>() {
        });
        schemas.put("GooglePayDonations", new GenericType<GooglePayDonations>() {
        });
        schemas.put("IdealDonations", new GenericType<IdealDonations>() {
        });
        schemas.put("PayWithGoogleDonations", new GenericType<PayWithGoogleDonations>() {
        });
        JSON.registerDescendants(DonationPaymentMethod.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return DonationPaymentMethod.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * ApplePayDonations, CardDonations, GooglePayDonations, IdealDonations, PayWithGoogleDonations
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(ApplePayDonations.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(CardDonations.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(GooglePayDonations.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(IdealDonations.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(PayWithGoogleDonations.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be ApplePayDonations, CardDonations, GooglePayDonations, IdealDonations, PayWithGoogleDonations");
    }

    /**
     * Get the actual instance, which can be the following:
     * ApplePayDonations, CardDonations, GooglePayDonations, IdealDonations, PayWithGoogleDonations
     *
     * @return The actual instance (ApplePayDonations, CardDonations, GooglePayDonations, IdealDonations, PayWithGoogleDonations)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ApplePayDonations`. If the actual instance is not `ApplePayDonations`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ApplePayDonations`
     * @throws ClassCastException if the instance is not `ApplePayDonations`
     */
    public ApplePayDonations getApplePayDonations() throws ClassCastException {
        return (ApplePayDonations)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CardDonations`. If the actual instance is not `CardDonations`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CardDonations`
     * @throws ClassCastException if the instance is not `CardDonations`
     */
    public CardDonations getCardDonations() throws ClassCastException {
        return (CardDonations)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GooglePayDonations`. If the actual instance is not `GooglePayDonations`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GooglePayDonations`
     * @throws ClassCastException if the instance is not `GooglePayDonations`
     */
    public GooglePayDonations getGooglePayDonations() throws ClassCastException {
        return (GooglePayDonations)super.getActualInstance();
    }

    /**
     * Get the actual instance of `IdealDonations`. If the actual instance is not `IdealDonations`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `IdealDonations`
     * @throws ClassCastException if the instance is not `IdealDonations`
     */
    public IdealDonations getIdealDonations() throws ClassCastException {
        return (IdealDonations)super.getActualInstance();
    }

    /**
     * Get the actual instance of `PayWithGoogleDonations`. If the actual instance is not `PayWithGoogleDonations`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PayWithGoogleDonations`
     * @throws ClassCastException if the instance is not `PayWithGoogleDonations`
     */
    public PayWithGoogleDonations getPayWithGoogleDonations() throws ClassCastException {
        return (PayWithGoogleDonations)super.getActualInstance();
    }

    /**
    * Create an instance of DonationPaymentMethod given an JSON string
    *
    * @param jsonString JSON string
    * @return An instance of DonationPaymentMethod
    * @throws IOException if the JSON string is invalid with respect to DonationPaymentMethod
    */
    public static DonationPaymentMethod fromJson(String jsonString) throws IOException {
        return JSON.getMapper().readValue(jsonString, DonationPaymentMethod.class);
    }

    /**
    * Convert an instance of DonationPaymentMethod to an JSON string
    *
    * @return JSON string
    */
    public String toJson() throws JsonProcessingException {
        return JSON.getMapper().writeValueAsString(this);
    }
}

