.class public final Lpa/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lda/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lda/q<",
            "Loa/c<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/Object;",
            "Lv9/d<",
            "-",
            "Ls9/u;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lpa/d$a;->j:Lpa/d$a;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lkotlin/jvm/internal/w;->b(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lda/q;

    sput-object v0, Lpa/d;->a:Lda/q;

    return-void
.end method

.method public static final synthetic a()Lda/q;
    .locals 1

    sget-object v0, Lpa/d;->a:Lda/q;

    return-object v0
.end method
