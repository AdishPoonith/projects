.class public final synthetic Lt1/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp3/q$a;


# instance fields
.field public final synthetic a:Lt1/c$a;

.field public final synthetic b:Ls1/n1;

.field public final synthetic c:Lv1/i;


# direct methods
.method public synthetic constructor <init>(Lt1/c$a;Ls1/n1;Lv1/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt1/h0;->a:Lt1/c$a;

    iput-object p2, p0, Lt1/h0;->b:Ls1/n1;

    iput-object p3, p0, Lt1/h0;->c:Lv1/i;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lt1/h0;->a:Lt1/c$a;

    iget-object v1, p0, Lt1/h0;->b:Ls1/n1;

    iget-object v2, p0, Lt1/h0;->c:Lv1/i;

    check-cast p1, Lt1/c;

    invoke-static {v0, v1, v2, p1}, Lt1/o1;->P0(Lt1/c$a;Ls1/n1;Lv1/i;Lt1/c;)V

    return-void
.end method
