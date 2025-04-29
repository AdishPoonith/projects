.class public final synthetic Lt0/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Lt0/l;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lt0/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt0/i;->j:Ljava/lang/String;

    iput-object p2, p0, Lt0/i;->k:Lt0/l;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lt0/i;->j:Ljava/lang/String;

    iget-object v1, p0, Lt0/i;->k:Lt0/l;

    invoke-static {v0, v1}, Lt0/l;->a(Ljava/lang/String;Lt0/l;)V

    return-void
.end method
