// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class SellItemCsReqOuterClass {
  /**
   * Protobuf type {@code SellItemCsReq}
   */
  public static final class SellItemCsReq extends ProtoMessage<SellItemCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional .ItemCostList item_cost_list = 4;</code>
     */
    private final ItemCostListOuterClass.ItemCostList itemCostList = ItemCostListOuterClass.ItemCostList.newInstance();

    private SellItemCsReq() {
    }

    /**
     * @return a new empty instance of {@code SellItemCsReq}
     */
    public static SellItemCsReq newInstance() {
      return new SellItemCsReq();
    }

    /**
     * <code>optional .ItemCostList item_cost_list = 4;</code>
     * @return whether the itemCostList field is set
     */
    public boolean hasItemCostList() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional .ItemCostList item_cost_list = 4;</code>
     * @return this
     */
    public SellItemCsReq clearItemCostList() {
      bitField0_ &= ~0x00000001;
      itemCostList.clear();
      return this;
    }

    /**
     * <code>optional .ItemCostList item_cost_list = 4;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableItemCostList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ItemCostListOuterClass.ItemCostList getItemCostList() {
      return itemCostList;
    }

    /**
     * <code>optional .ItemCostList item_cost_list = 4;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ItemCostListOuterClass.ItemCostList getMutableItemCostList() {
      bitField0_ |= 0x00000001;
      return itemCostList;
    }

    /**
     * <code>optional .ItemCostList item_cost_list = 4;</code>
     * @param value the itemCostList to set
     * @return this
     */
    public SellItemCsReq setItemCostList(final ItemCostListOuterClass.ItemCostList value) {
      bitField0_ |= 0x00000001;
      itemCostList.copyFrom(value);
      return this;
    }

    @Override
    public SellItemCsReq copyFrom(final SellItemCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        itemCostList.copyFrom(other.itemCostList);
      }
      return this;
    }

    @Override
    public SellItemCsReq mergeFrom(final SellItemCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasItemCostList()) {
        getMutableItemCostList().mergeFrom(other.itemCostList);
      }
      return this;
    }

    @Override
    public SellItemCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      itemCostList.clear();
      return this;
    }

    @Override
    public SellItemCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      itemCostList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof SellItemCsReq)) {
        return false;
      }
      SellItemCsReq other = (SellItemCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasItemCostList() || itemCostList.equals(other.itemCostList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 34);
        output.writeMessageNoTag(itemCostList);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(itemCostList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SellItemCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 34: {
            // itemCostList
            input.readMessage(itemCostList);
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeMessage(FieldNames.itemCostList, itemCostList);
      }
      output.endObject();
    }

    @Override
    public SellItemCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 203506238:
          case -1124889692: {
            if (input.isAtField(FieldNames.itemCostList)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(itemCostList);
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public SellItemCsReq clone() {
      return new SellItemCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SellItemCsReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SellItemCsReq(), data).checkInitialized();
    }

    public static SellItemCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SellItemCsReq(), input).checkInitialized();
    }

    public static SellItemCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SellItemCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating SellItemCsReq messages
     */
    public static MessageFactory<SellItemCsReq> getFactory() {
      return SellItemCsReqFactory.INSTANCE;
    }

    private enum SellItemCsReqFactory implements MessageFactory<SellItemCsReq> {
      INSTANCE;

      @Override
      public SellItemCsReq create() {
        return SellItemCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName itemCostList = FieldName.forField("itemCostList", "item_cost_list");
    }
  }
}
