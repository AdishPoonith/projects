.class Lo5/b$a;
.super Lo5/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo5/b;->a(Lo5/b$b;Lv5/a;Ljava/lang/Class;)Lo5/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo5/b<",
        "TSerializationT;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Lo5/b$b;


# direct methods
.method constructor <init>(Lv5/a;Ljava/lang/Class;Lo5/b$b;)V
    .locals 0

    iput-object p3, p0, Lo5/b$a;->c:Lo5/b$b;

    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3}, Lo5/b;-><init>(Lv5/a;Ljava/lang/Class;Lo5/b$a;)V

    return-void
.end method


# virtual methods
.method public d(Lo5/n;Lg5/x;)Lg5/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TSerializationT;",
            "Lg5/x;",
            ")",
            "Lg5/f;"
        }
    .end annotation

    iget-object v0, p0, Lo5/b$a;->c:Lo5/b$b;

    invoke-interface {v0, p1, p2}, Lo5/b$b;->a(Lo5/n;Lg5/x;)Lg5/f;

    move-result-object p1

    return-object p1
.end method
