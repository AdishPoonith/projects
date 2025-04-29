.class Lo5/i$a;
.super Lo5/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo5/i;->a(Lo5/i$b;Lv5/a;Ljava/lang/Class;)Lo5/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo5/i<",
        "TSerializationT;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Lo5/i$b;


# direct methods
.method constructor <init>(Lv5/a;Ljava/lang/Class;Lo5/i$b;)V
    .locals 0

    iput-object p3, p0, Lo5/i$a;->c:Lo5/i$b;

    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3}, Lo5/i;-><init>(Lv5/a;Ljava/lang/Class;Lo5/i$a;)V

    return-void
.end method
