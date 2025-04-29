.class public Li9/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li9/j$b;
    }
.end annotation


# static fields
.field private static final a:Li9/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li9/g<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Li9/j$a;

    invoke-direct {v0}, Li9/j$a;-><init>()V

    sput-object v0, Li9/j;->a:Li9/g;

    return-void
.end method

.method public static a(Li9/d;Ljava/util/List;)Li9/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li9/d;",
            "Ljava/util/List<",
            "+",
            "Li9/h;",
            ">;)",
            "Li9/d;"
        }
    .end annotation

    const-string v0, "channel"

    invoke-static {p0, v0}, Lb5/n;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li9/h;

    new-instance v1, Li9/j$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v0, v2}, Li9/j$b;-><init>(Li9/d;Li9/h;Li9/i;)V

    move-object p0, v1

    goto :goto_0

    :cond_0
    return-object p0
.end method
