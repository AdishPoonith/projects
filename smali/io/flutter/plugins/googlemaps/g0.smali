.class Lio/flutter/plugins/googlemaps/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw4/b0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/googlemaps/g0$a;
    }
.end annotation


# instance fields
.field protected final b:Ljava/lang/String;

.field protected final c:Lr8/k;

.field protected final d:Landroid/os/Handler;


# direct methods
.method constructor <init>(Lr8/k;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lio/flutter/plugins/googlemaps/g0;->d:Landroid/os/Handler;

    iput-object p2, p0, Lio/flutter/plugins/googlemaps/g0;->b:Ljava/lang/String;

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/g0;->c:Lr8/k;

    return-void
.end method


# virtual methods
.method public a(III)Lw4/y;
    .locals 1

    new-instance v0, Lio/flutter/plugins/googlemaps/g0$a;

    invoke-direct {v0, p0, p1, p2, p3}, Lio/flutter/plugins/googlemaps/g0$a;-><init>(Lio/flutter/plugins/googlemaps/g0;III)V

    invoke-virtual {v0}, Lio/flutter/plugins/googlemaps/g0$a;->e()Lw4/y;

    move-result-object p1

    return-object p1
.end method
