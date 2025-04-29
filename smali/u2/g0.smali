.class public final synthetic Lu2/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lu2/h0;

.field public final synthetic k:Lx1/b0;


# direct methods
.method public synthetic constructor <init>(Lu2/h0;Lx1/b0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu2/g0;->j:Lu2/h0;

    iput-object p2, p0, Lu2/g0;->k:Lx1/b0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lu2/g0;->j:Lu2/h0;

    iget-object v1, p0, Lu2/g0;->k:Lx1/b0;

    invoke-static {v0, v1}, Lu2/h0;->x(Lu2/h0;Lx1/b0;)V

    return-void
.end method
