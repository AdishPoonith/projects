.class Li9/j$b;
.super Li9/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li9/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private final a:Li9/d;

.field private final b:Li9/h;


# direct methods
.method private constructor <init>(Li9/d;Li9/h;)V
    .locals 0

    invoke-direct {p0}, Li9/d;-><init>()V

    iput-object p1, p0, Li9/j$b;->a:Li9/d;

    const-string p1, "interceptor"

    invoke-static {p2, p1}, Lb5/n;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li9/h;

    iput-object p1, p0, Li9/j$b;->b:Li9/h;

    return-void
.end method

.method synthetic constructor <init>(Li9/d;Li9/h;Li9/i;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Li9/j$b;-><init>(Li9/d;Li9/h;)V

    return-void
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Li9/j$b;->a:Li9/d;

    invoke-virtual {v0}, Li9/d;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public e(Li9/z0;Li9/c;)Li9/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ReqT:",
            "Ljava/lang/Object;",
            "RespT:",
            "Ljava/lang/Object;",
            ">(",
            "Li9/z0<",
            "TReqT;TRespT;>;",
            "Li9/c;",
            ")",
            "Li9/g<",
            "TReqT;TRespT;>;"
        }
    .end annotation

    iget-object v0, p0, Li9/j$b;->b:Li9/h;

    iget-object v1, p0, Li9/j$b;->a:Li9/d;

    invoke-interface {v0, p1, p2, v1}, Li9/h;->a(Li9/z0;Li9/c;Li9/d;)Li9/g;

    move-result-object p1

    return-object p1
.end method
