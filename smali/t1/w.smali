.class public final synthetic Lt1/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp3/q$a;


# instance fields
.field public final synthetic a:Lt1/c$a;

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Lt1/c$a;Ljava/lang/Object;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt1/w;->a:Lt1/c$a;

    iput-object p2, p0, Lt1/w;->b:Ljava/lang/Object;

    iput-wide p3, p0, Lt1/w;->c:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Lt1/w;->a:Lt1/c$a;

    iget-object v1, p0, Lt1/w;->b:Ljava/lang/Object;

    iget-wide v2, p0, Lt1/w;->c:J

    check-cast p1, Lt1/c;

    invoke-static {v0, v1, v2, v3, p1}, Lt1/o1;->w1(Lt1/c$a;Ljava/lang/Object;JLt1/c;)V

    return-void
.end method
