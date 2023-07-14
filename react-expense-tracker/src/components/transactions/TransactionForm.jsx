import { useState } from "react"
import { useGlobalState } from "../../context/GlobalState"

function TransactionForm() {
    const { addTransact } = useGlobalState()
    const [description, setDescription] = useState()
    const [amount, setAmount] = useState(0)
    const onSubmit = (e) => {
        e.preventDefault()
        addTransact({
            id: window.crypto.randomUUID(),
            description,
            amount: +amount
        })
        setAmount(0);
        setDescription("");
    }
    return (
        <div>
            <form onSubmit={onSubmit}>
                <input className="bg-zinc-500 text-white px-3 py-2 rounded-lg block mb-2 w-full " type="text" placeholder="Enter a Description"
                    onChange={(e) => setDescription(e.target.value)} value={description}/>
                <input className="bg-zinc-500 text-white px-3 py-2 rounded-lg block mb-2 w-full " type="number"
                    step={0.01} placeholder="Enter an Amount"
                    onChange={(e) => setAmount(e.target.value)} value={amount}/>
                <button className="bg-blue-500 text-white px-3 py-2 rounded-lg block mb-2 w-full ">
                    Add Transaction
                </button>
            </form>
        </div>
    )
}

export default TransactionForm