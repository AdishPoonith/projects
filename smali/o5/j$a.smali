.class Lo5/j$a;
.super Lo5/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo5/j;->a(Lo5/j$b;Ljava/lang/Class;Ljava/lang/Class;)Lo5/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo5/j<",
        "TParametersT;TSerializationT;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Lo5/j$b;


# direct methods
.method constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Lo5/j$b;)V
    .locals 0

    iput-object p3, p0, Lo5/j$a;->c:Lo5/j$b;

    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3}, Lo5/j;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lo5/j$a;)V

    return-void
.end method
