<?php
/**
 * MyTracerResult
 *
 * PHP version 7.4
 *
 * @category Class
 * @package  Bitget
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * Bitget Open API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0.0
 * Generated by: https://openapi-generator.tech
 * OpenAPI Generator version: 6.2.1
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace Bitget\Model;

use \ArrayAccess;
use \Bitget\ObjectSerializer;

/**
 * MyTracerResult Class Doc Comment
 *
 * @category Class
 * @package  Bitget
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class MyTracerResult implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'MyTracerResult';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'account_equity' => 'string',
        'can_remove_trace_user' => 'bool',
        'tracer_head_pic' => 'string',
        'tracer_nick_name' => 'string',
        'tracer_user_id' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'account_equity' => null,
        'can_remove_trace_user' => null,
        'tracer_head_pic' => null,
        'tracer_nick_name' => null,
        'tracer_user_id' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'account_equity' => false,
		'can_remove_trace_user' => false,
		'tracer_head_pic' => false,
		'tracer_nick_name' => false,
		'tracer_user_id' => false
    ];

    /**
      * If a nullable field gets set to null, insert it here
      *
      * @var boolean[]
      */
    protected array $openAPINullablesSetToNull = [];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPITypes()
    {
        return self::$openAPITypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPIFormats()
    {
        return self::$openAPIFormats;
    }

    /**
     * Array of nullable properties
     *
     * @return array
     */
    protected static function openAPINullables(): array
    {
        return self::$openAPINullables;
    }

    /**
     * Array of nullable field names deliberately set to null
     *
     * @return boolean[]
     */
    private function getOpenAPINullablesSetToNull(): array
    {
        return $this->openAPINullablesSetToNull;
    }

    /**
     * Setter - Array of nullable field names deliberately set to null
     *
     * @param boolean[] $openAPINullablesSetToNull
     */
    private function setOpenAPINullablesSetToNull(array $openAPINullablesSetToNull): void
    {
        $this->openAPINullablesSetToNull = $openAPINullablesSetToNull;
    }

    /**
     * Checks if a property is nullable
     *
     * @param string $property
     * @return bool
     */
    public static function isNullable(string $property): bool
    {
        return self::openAPINullables()[$property] ?? false;
    }

    /**
     * Checks if a nullable property is set to null.
     *
     * @param string $property
     * @return bool
     */
    public function isNullableSetToNull(string $property): bool
    {
        return in_array($property, $this->getOpenAPINullablesSetToNull(), true);
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'account_equity' => 'accountEquity',
        'can_remove_trace_user' => 'canRemoveTraceUser',
        'tracer_head_pic' => 'tracerHeadPic',
        'tracer_nick_name' => 'tracerNickName',
        'tracer_user_id' => 'tracerUserId'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'account_equity' => 'setAccountEquity',
        'can_remove_trace_user' => 'setCanRemoveTraceUser',
        'tracer_head_pic' => 'setTracerHeadPic',
        'tracer_nick_name' => 'setTracerNickName',
        'tracer_user_id' => 'setTracerUserId'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'account_equity' => 'getAccountEquity',
        'can_remove_trace_user' => 'getCanRemoveTraceUser',
        'tracer_head_pic' => 'getTracerHeadPic',
        'tracer_nick_name' => 'getTracerNickName',
        'tracer_user_id' => 'getTracerUserId'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$openAPIModelName;
    }


    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->setIfExists('account_equity', $data ?? [], null);
        $this->setIfExists('can_remove_trace_user', $data ?? [], null);
        $this->setIfExists('tracer_head_pic', $data ?? [], null);
        $this->setIfExists('tracer_nick_name', $data ?? [], null);
        $this->setIfExists('tracer_user_id', $data ?? [], null);
    }

    /**
    * Sets $this->container[$variableName] to the given data or to the given default Value; if $variableName
    * is nullable and its value is set to null in the $fields array, then mark it as "set to null" in the
    * $this->openAPINullablesSetToNull array
    *
    * @param string $variableName
    * @param array  $fields
    * @param mixed  $defaultValue
    */
    private function setIfExists(string $variableName, array $fields, $defaultValue): void
    {
        if (self::isNullable($variableName) && array_key_exists($variableName, $fields) && is_null($fields[$variableName])) {
            $this->openAPINullablesSetToNull[] = $variableName;
        }

        $this->container[$variableName] = $fields[$variableName] ?? $defaultValue;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets account_equity
     *
     * @return string|null
     */
    public function getAccountEquity()
    {
        return $this->container['account_equity'];
    }

    /**
     * Sets account_equity
     *
     * @param string|null $account_equity account_equity
     *
     * @return self
     */
    public function setAccountEquity($account_equity)
    {

        if (is_null($account_equity)) {
            throw new \InvalidArgumentException('non-nullable account_equity cannot be null');
        }

        $this->container['account_equity'] = $account_equity;

        return $this;
    }

    /**
     * Gets can_remove_trace_user
     *
     * @return bool|null
     */
    public function getCanRemoveTraceUser()
    {
        return $this->container['can_remove_trace_user'];
    }

    /**
     * Sets can_remove_trace_user
     *
     * @param bool|null $can_remove_trace_user can_remove_trace_user
     *
     * @return self
     */
    public function setCanRemoveTraceUser($can_remove_trace_user)
    {

        if (is_null($can_remove_trace_user)) {
            throw new \InvalidArgumentException('non-nullable can_remove_trace_user cannot be null');
        }

        $this->container['can_remove_trace_user'] = $can_remove_trace_user;

        return $this;
    }

    /**
     * Gets tracer_head_pic
     *
     * @return string|null
     */
    public function getTracerHeadPic()
    {
        return $this->container['tracer_head_pic'];
    }

    /**
     * Sets tracer_head_pic
     *
     * @param string|null $tracer_head_pic tracer_head_pic
     *
     * @return self
     */
    public function setTracerHeadPic($tracer_head_pic)
    {

        if (is_null($tracer_head_pic)) {
            throw new \InvalidArgumentException('non-nullable tracer_head_pic cannot be null');
        }

        $this->container['tracer_head_pic'] = $tracer_head_pic;

        return $this;
    }

    /**
     * Gets tracer_nick_name
     *
     * @return string|null
     */
    public function getTracerNickName()
    {
        return $this->container['tracer_nick_name'];
    }

    /**
     * Sets tracer_nick_name
     *
     * @param string|null $tracer_nick_name tracer_nick_name
     *
     * @return self
     */
    public function setTracerNickName($tracer_nick_name)
    {

        if (is_null($tracer_nick_name)) {
            throw new \InvalidArgumentException('non-nullable tracer_nick_name cannot be null');
        }

        $this->container['tracer_nick_name'] = $tracer_nick_name;

        return $this;
    }

    /**
     * Gets tracer_user_id
     *
     * @return string|null
     */
    public function getTracerUserId()
    {
        return $this->container['tracer_user_id'];
    }

    /**
     * Sets tracer_user_id
     *
     * @param string|null $tracer_user_id tracer_user_id
     *
     * @return self
     */
    public function setTracerUserId($tracer_user_id)
    {

        if (is_null($tracer_user_id)) {
            throw new \InvalidArgumentException('non-nullable tracer_user_id cannot be null');
        }

        $this->container['tracer_user_id'] = $tracer_user_id;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset): bool
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed|null
     */
    #[\ReturnTypeWillChange]
    public function offsetGet($offset)
    {
        return $this->container[$offset] ?? null;
    }

    /**
     * Sets value based on offset.
     *
     * @param int|null $offset Offset
     * @param mixed    $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value): void
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset): void
    {
        unset($this->container[$offset]);
    }

    /**
     * Serializes the object to a value that can be serialized natively by json_encode().
     * @link https://www.php.net/manual/en/jsonserializable.jsonserialize.php
     *
     * @return mixed Returns data which can be serialized by json_encode(), which is a value
     * of any type other than a resource.
     */
    #[\ReturnTypeWillChange]
    public function jsonSerialize()
    {
       return ObjectSerializer::sanitizeForSerialization($this);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        return json_encode(
            ObjectSerializer::sanitizeForSerialization($this),
            JSON_PRETTY_PRINT
        );
    }

    /**
     * Gets a header-safe presentation of the object
     *
     * @return string
     */
    public function toHeaderValue()
    {
        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}

