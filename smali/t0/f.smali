.class public final synthetic Lt0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lt0/g;


# direct methods
.method public synthetic constructor <init>(Lt0/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt0/f;->j:Lt0/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lt0/f;->j:Lt0/g;

    invoke-static {v0}, Lt0/g;->a(Lt0/g;)V

    return-void
.end method
