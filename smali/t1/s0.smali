.class public final synthetic Lt1/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp3/q$a;


# instance fields
.field public final synthetic a:Lt1/c$a;

.field public final synthetic b:Lu2/n;

.field public final synthetic c:Lu2/q;


# direct methods
.method public synthetic constructor <init>(Lt1/c$a;Lu2/n;Lu2/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt1/s0;->a:Lt1/c$a;

    iput-object p2, p0, Lt1/s0;->b:Lu2/n;

    iput-object p3, p0, Lt1/s0;->c:Lu2/q;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lt1/s0;->a:Lt1/c$a;

    iget-object v1, p0, Lt1/s0;->b:Lu2/n;

    iget-object v2, p0, Lt1/s0;->c:Lu2/q;

    check-cast p1, Lt1/c;

    invoke-static {v0, v1, v2, p1}, Lt1/o1;->S0(Lt1/c$a;Lu2/n;Lu2/q;Lt1/c;)V

    return-void
.end method
