.class public final synthetic Lu2/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lu2/h0;


# direct methods
.method public synthetic constructor <init>(Lu2/h0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu2/e0;->j:Lu2/h0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lu2/e0;->j:Lu2/h0;

    invoke-static {v0}, Lu2/h0;->w(Lu2/h0;)V

    return-void
.end method
