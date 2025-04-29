.class public final synthetic Lt1/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp3/q$a;


# instance fields
.field public final synthetic a:Lt1/c$a;

.field public final synthetic b:J


# direct methods
.method public synthetic constructor <init>(Lt1/c$a;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt1/p;->a:Lt1/c$a;

    iput-wide p2, p0, Lt1/p;->b:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lt1/p;->a:Lt1/c$a;

    iget-wide v1, p0, Lt1/p;->b:J

    check-cast p1, Lt1/c;

    invoke-static {v0, v1, v2, p1}, Lt1/o1;->t1(Lt1/c$a;JLt1/c;)V

    return-void
.end method
