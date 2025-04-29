.class public final synthetic Lt1/i1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp3/q$b;


# instance fields
.field public final synthetic a:Lt1/o1;

.field public final synthetic b:Ls1/c3;


# direct methods
.method public synthetic constructor <init>(Lt1/o1;Ls1/c3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt1/i1;->a:Lt1/o1;

    iput-object p2, p0, Lt1/i1;->b:Ls1/c3;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lp3/l;)V
    .locals 2

    iget-object v0, p0, Lt1/i1;->a:Lt1/o1;

    iget-object v1, p0, Lt1/i1;->b:Ls1/c3;

    check-cast p1, Lt1/c;

    invoke-static {v0, v1, p1, p2}, Lt1/o1;->q1(Lt1/o1;Ls1/c3;Lt1/c;Lp3/l;)V

    return-void
.end method
