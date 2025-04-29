.class Lo5/c$a;
.super Lo5/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo5/c;->a(Lo5/c$b;Ljava/lang/Class;Ljava/lang/Class;)Lo5/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo5/c<",
        "TKeyT;TSerializationT;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Lo5/c$b;


# direct methods
.method constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Lo5/c$b;)V
    .locals 0

    iput-object p3, p0, Lo5/c$a;->c:Lo5/c$b;

    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3}, Lo5/c;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lo5/c$a;)V

    return-void
.end method
