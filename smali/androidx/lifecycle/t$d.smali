.class final Landroidx/lifecycle/t$d;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lda/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/lifecycle/t;->b(Landroidx/lifecycle/b0;)Landroidx/lifecycle/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lda/l<",
        "Lc0/a;",
        "Landroidx/lifecycle/v;",
        ">;"
    }
.end annotation


# static fields
.field public static final j:Landroidx/lifecycle/t$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/lifecycle/t$d;

    invoke-direct {v0}, Landroidx/lifecycle/t$d;-><init>()V

    sput-object v0, Landroidx/lifecycle/t$d;->j:Landroidx/lifecycle/t$d;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lc0/a;)Landroidx/lifecycle/v;
    .locals 1

    const-string v0, "$this$initializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Landroidx/lifecycle/v;

    invoke-direct {p1}, Landroidx/lifecycle/v;-><init>()V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lc0/a;

    invoke-virtual {p0, p1}, Landroidx/lifecycle/t$d;->a(Lc0/a;)Landroidx/lifecycle/v;

    move-result-object p1

    return-object p1
.end method
