.class public final synthetic Lt1/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp3/q$a;


# instance fields
.field public final synthetic a:Lt1/c$a;

.field public final synthetic b:Lu2/n;

.field public final synthetic c:Lu2/q;

.field public final synthetic d:Ljava/io/IOException;

.field public final synthetic e:Z


# direct methods
.method public synthetic constructor <init>(Lt1/c$a;Lu2/n;Lu2/q;Ljava/io/IOException;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt1/u0;->a:Lt1/c$a;

    iput-object p2, p0, Lt1/u0;->b:Lu2/n;

    iput-object p3, p0, Lt1/u0;->c:Lu2/q;

    iput-object p4, p0, Lt1/u0;->d:Ljava/io/IOException;

    iput-boolean p5, p0, Lt1/u0;->e:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 6

    iget-object v0, p0, Lt1/u0;->a:Lt1/c$a;

    iget-object v1, p0, Lt1/u0;->b:Lu2/n;

    iget-object v2, p0, Lt1/u0;->c:Lu2/q;

    iget-object v3, p0, Lt1/u0;->d:Ljava/io/IOException;

    iget-boolean v4, p0, Lt1/u0;->e:Z

    move-object v5, p1

    check-cast v5, Lt1/c;

    invoke-static/range {v0 .. v5}, Lt1/o1;->W0(Lt1/c$a;Lu2/n;Lu2/q;Ljava/io/IOException;ZLt1/c;)V

    return-void
.end method
