.class final Lu4/x;
.super Lv4/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lu4/c$f;


# direct methods
.method constructor <init>(Lu4/c;Lu4/c$f;)V
    .locals 0

    iput-object p2, p0, Lu4/x;->a:Lu4/c$f;

    invoke-direct {p0}, Lv4/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final s(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 1

    iget-object v0, p0, Lu4/x;->a:Lu4/c$f;

    invoke-interface {v0, p1}, Lu4/c$f;->T(Lcom/google/android/gms/maps/model/LatLng;)V

    return-void
.end method
