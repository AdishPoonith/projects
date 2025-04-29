.class final Lla/f0$a;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lda/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lla/f0;->a(Lv9/g;Lv9/g;Z)Lv9/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lda/p<",
        "Lv9/g;",
        "Lv9/g$b;",
        "Lv9/g;",
        ">;"
    }
.end annotation


# static fields
.field public static final j:Lla/f0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lla/f0$a;

    invoke-direct {v0}, Lla/f0$a;-><init>()V

    sput-object v0, Lla/f0$a;->j:Lla/f0$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lv9/g;Lv9/g$b;)Lv9/g;
    .locals 1

    instance-of v0, p2, Lla/e0;

    if-eqz v0, :cond_0

    check-cast p2, Lla/e0;

    invoke-interface {p2}, Lla/e0;->t()Lla/e0;

    move-result-object p2

    invoke-interface {p1, p2}, Lv9/g;->r(Lv9/g;)Lv9/g;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {p1, p2}, Lv9/g;->r(Lv9/g;)Lv9/g;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lv9/g;

    check-cast p2, Lv9/g$b;

    invoke-virtual {p0, p1, p2}, Lla/f0$a;->a(Lv9/g;Lv9/g$b;)Lv9/g;

    move-result-object p1

    return-object p1
.end method
