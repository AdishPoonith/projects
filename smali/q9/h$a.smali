.class Lq9/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li9/r0$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq9/h;->a(Li9/r0$g;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Li9/r0$h;

.field final synthetic b:Lq9/h;


# direct methods
.method constructor <init>(Lq9/h;Li9/r0$h;)V
    .locals 0

    iput-object p1, p0, Lq9/h$a;->b:Lq9/h;

    iput-object p2, p0, Lq9/h$a;->a:Li9/r0$h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Li9/q;)V
    .locals 2

    iget-object v0, p0, Lq9/h$a;->b:Lq9/h;

    iget-object v1, p0, Lq9/h$a;->a:Li9/r0$h;

    invoke-static {v0, v1, p1}, Lq9/h;->g(Lq9/h;Li9/r0$h;Li9/q;)V

    return-void
.end method
