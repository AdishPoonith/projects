.class public final Li9/r0$g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li9/r0$g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Li9/x;",
            ">;"
        }
    .end annotation
.end field

.field private b:Li9/a;

.field private c:Ljava/lang/Object;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Li9/a;->c:Li9/a;

    iput-object v0, p0, Li9/r0$g$a;->b:Li9/a;

    return-void
.end method


# virtual methods
.method public a()Li9/r0$g;
    .locals 5

    new-instance v0, Li9/r0$g;

    iget-object v1, p0, Li9/r0$g$a;->a:Ljava/util/List;

    iget-object v2, p0, Li9/r0$g$a;->b:Li9/a;

    iget-object v3, p0, Li9/r0$g$a;->c:Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Li9/r0$g;-><init>(Ljava/util/List;Li9/a;Ljava/lang/Object;Li9/r0$a;)V

    return-object v0
.end method

.method public b(Ljava/util/List;)Li9/r0$g$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Li9/x;",
            ">;)",
            "Li9/r0$g$a;"
        }
    .end annotation

    iput-object p1, p0, Li9/r0$g$a;->a:Ljava/util/List;

    return-object p0
.end method

.method public c(Li9/a;)Li9/r0$g$a;
    .locals 0

    iput-object p1, p0, Li9/r0$g$a;->b:Li9/a;

    return-object p0
.end method

.method public d(Ljava/lang/Object;)Li9/r0$g$a;
    .locals 0

    iput-object p1, p0, Li9/r0$g$a;->c:Ljava/lang/Object;

    return-object p0
.end method
