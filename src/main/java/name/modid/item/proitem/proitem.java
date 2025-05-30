package name.modid.item.proitem;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class proitem extends Item {
    public proitem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World workld = context.getWorld();
        if (!workld.isClient()){
            BlockPos blockPos = context.getBlockPos();
            PlayerEntity player = context.getPlayer();
            boolean foundBlock = false;
            for (int i = -64;i <= blockPos.getY() + 64; i++){
                BlockState state = context.getWorld().getBlockState(blockPos.down(i));
                if (isRightblock(state)){
                    outputMessage(blockPos.down(i),player,state.getBlock());
                    foundBlock = true;
                    break;
                }
            }
            if (!foundBlock){
                player.sendMessage(Text.literal("No Ore Found"));
            }
        }
        context.getStack().damage(100,context.getPlayer(),
                playerEntity -> playerEntity.sendToolBreakStatus(playerEntity.getActiveHand()));
        return ActionResult.SUCCESS;
    }

    private void outputMessage(BlockPos down, PlayerEntity player, Block block) {
        player .sendMessage(Text.literal("Found" + block.asItem().getName().getString() + "at" +
                "(" + down.getX() + "," + down.getY() + "," + down.getZ() + ")!"),false);
    }

    private boolean isRightblock(BlockState state) {
        return state.isOf(Blocks.IRON_ORE) || state.isOf(Blocks.DIAMOND_ORE);
    }
}
