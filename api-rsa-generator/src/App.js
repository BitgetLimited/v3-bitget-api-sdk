import './App.css';
import { Button, Select, Space, Card, Row, Col } from 'antd';
import TextArea from 'antd/es/input/TextArea';
import { useState } from "react";
import "crypto";

async function generateKeysWithBits (bits) {
  const result = await crypto.subtle.generateKey(
    {
      name: "RSASSA-PKCS1-v1_5",
      modulusLength: parseInt(bits),
      publicExponent: new Uint8Array([1, 0, 1]),
      hash: "SHA-256"
    },
    true,
    ["sign", "verify"]
  ).then(function(res){
    return res
  });
  
  let priv = await crypto.subtle.exportKey("pkcs8", result.privateKey)
  priv = Buffer.from(priv).toString('base64')
  priv = priv.match(/.{1,64}/g).join('\n')
  let privStr = "-----BEGIN PRIVATE KEY-----\n" + priv + "\n-----END PRIVATE KEY-----"

  let pub = await crypto.subtle.exportKey("spki", result.publicKey)
  pub = Buffer.from(pub).toString('base64')
  pub = pub.match(/.{1,64}/g).join('\n')
  let pubStr = "-----BEGIN PUBLIC KEY-----\n" + pub + "\n-----END PUBLIC KEY-----"
  return {"priv": privStr, "pub": pubStr}
}

function App() {
  var selectVal = "2048"
  const [loading, setLoading] = useState(Boolean)
  const [privVal, setPrivVal] = useState("")
  const [pubVal, setPubVal] = useState("")

  const generateKeys = async () => {
    setLoading(true)
    setPrivVal("")
    setPubVal("")
    const res = await generateKeysWithBits(parseInt(selectVal))
    setPrivVal(res.priv)
    setPubVal(res.pub)
    setLoading(false)
  }
  const copyPriv = async () => {
    navigator.clipboard.writeText(privVal)
  }
  const copyPub = async () => {
    navigator.clipboard.writeText(pubVal)
  }

  return (
    <div className="App">
      <Space direction="vertical" style={{ width:"100%" }}>
        <Row>
          <h2>Generate Keys</h2>
        </Row>
        <Row>
          <p>You can generate an RSA PKCS#8 private key and public key of 2048-bit(recommend) or 4096-bit.</p>
        </Row>
        <Row>
          <Select
            defaultValue={{value: '2048', label: '2048-bit'}}
            onChange={(value) => {selectVal = value}}
            options={[
              {
                value: '2048',
                label: '2048-bit'
              },
              {
                value: '4096',
                label: '4096-bit'
              },
            ]}
          />
        </Row>
        <Row>
          <Button type="primary" onClick={generateKeys} loading={loading}>Generate Keys</Button>
        </Row>

        <Row style={{width:"100%"}}>
          <Col span={11}>
            <Card title="Private Key" size='middle'>
              <TextArea autoSize={{ minRows: 8, maxRows: 8 }} value={privVal} spellCheck="false"></TextArea>
              <Button type="primary" style={{ marginTop: "2vh" }} onClick={copyPriv} block>Copy</Button>
            </Card>
          </Col>
          <Col span={11} offset={1}>
            <Card title="Public Key" size='middle'>
              <TextArea autoSize={{ minRows: 8, maxRows: 8 }} value={pubVal} spellCheck="false"></TextArea>
              <Button type="primary" style={{ marginTop: "2vh" }} onClick={copyPub} block>Copy</Button>
            </Card>
          </Col>
        </Row>
      </Space>
    </div>
  );
}

export default App;
